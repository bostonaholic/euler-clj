(ns eu.euler2
  (:use [eu.core]))

(defn euler2 [x]
  (reduce + (filter even? (fib-less-than x))))
