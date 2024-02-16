(ns clojure-integration-tests.datomic
  (:require [datomic.client.api :as d]))


(def client (d/client {:system "dev"
                       :server-type :datomic-local}))

(defn create-db [name]
  (d/create-database client {:db-name name}))

(defn list-dbs []
  (d/list-databases client {}))

(def conn (d/connect client {:db-name "test-db"}))


