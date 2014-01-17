(ns capi-clojure-client.http
  (:require [clj-http.client :as client]
            [cheshire.core :as json]))

(defn get
  "Make an API GET request."
  [url {:as params}]
  (io! (json/decode (:body (client/get url {:accept :json
                                            :query-params params}))
                    true)))
