(ns eu.euler003
  (:use eu.core))

(defn euler003 [x]
  (last (prime-factors x)))

(defn solution []
  (euler003 600851475143))
