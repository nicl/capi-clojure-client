# Clojure client for The Guardian Content API

Very simple client library for The Guardian Content API.

## Usage

Bring in the main dependency:

    (require '[capi-clojure-client.core :as api])

Then make some requests:

    (api/item "info/developer-blog/2014/jan/16/guardian-hack-day-january-2014-live-blog")

Functions accept optional parameters as key-value pairs:

    (api/search :q "chelsea")

Responses are Clojure maps so accessing fields is easy:

    (-> (api/search) :response :total)

## License

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
