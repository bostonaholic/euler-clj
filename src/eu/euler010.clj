(ns eu.euler010
  (:use eu.prime))

(defn euler010 [n]
  (reduce + (primes-below n)))

(defn solution []
  (euler010 2000000))
