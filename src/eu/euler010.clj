(ns eu.euler010
  (:use [math.prime]))

(defn euler010 [n]
  (reduce + (primes-below-n n)))

(defn solution []
  (euler010 2000000))
