(ns clojure1.core)
(require '[environ.core :refer [env]])
(require '[clj-http.client :as client])

(defn -main
  "I don't do a whole lot."
  []
  (println "Hello, World!"))

(println (env :number))
(println (env :sender))
(println (client/get "http://example.com"))


