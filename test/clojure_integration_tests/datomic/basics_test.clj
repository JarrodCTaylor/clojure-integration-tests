(ns clojure-integration-tests.datomic.basics-test
  (:require
    [clojure.test :refer :all]
    [clojure-integration-tests.datomic :as sut]))

(def test-db-name "test-db")

(deftest create-and-list-db
  (sut/create-db test-db-name)
  (is (= [test-db-name] (sut/list-dbs))))

(deftest query-db
  (let [conn (sut/conn test-db-name)]
    (sut/transact-schema conn)
    (sut/transact-entities conn)
    (is (= 2 (sut/count-foos conn)))))