(ns capi-clojure-client.core
  (:require [capi-clojure-client.http :as http]))

(def api-url (atom "http://api.gu.com/"))

(defn connect!
  "Set base url to use for requests."
  [url]
  (reset! api-url url))

(defn search
  "Returns articles."
  [& {:as params}]
  (http/get (str @api-url "search") params))

(defn tags
  "Returns tags."
  [& {:as params}]
  (http/get (str @api-url "tags") params))

(defn sections
  "Returns sections."
  [& {:as params}]
  (http/get (str @api-url "sections") params))

(defn network-front
  "Returns sections."
  [& {:as params}]
  (http/get @api-url params))

(defn item
  "Returns item."
  [path & {:as params}]
  (http/get (str @api-url path) params))
