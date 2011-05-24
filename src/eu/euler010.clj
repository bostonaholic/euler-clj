(ns eu.euler010
  (:use bostonaholic.utils.math.prime))

(defn euler010 [n]
  (reduce + (primes-below n)))

(defn solution []
  (euler010 2000000))
