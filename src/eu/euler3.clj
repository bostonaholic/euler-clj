(ns eu.euler3
  (:use eu.core))

(defn euler3 [x]
  (last (prime-factors x)))

