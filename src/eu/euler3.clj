(ns eu.euler3
  (:use eu.core))

(defn euler3 [x]
  (last (prime-factors x)))

(defn solution []
  (euler3 600851475143))
