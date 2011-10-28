(ns eu.euler007
  (:use eu.core
        eu.prime))

(defn euler007 [n]
  (nth-prime n))

(defn solution []
  (euler007 10001))
