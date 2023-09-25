(ns clojure1.core)
(require '[environ.core :refer [env]])

(defn -main
  "I don't do a whole lot."
  []
  (println "Hello, World!"))

(println (env :ENV_1))

