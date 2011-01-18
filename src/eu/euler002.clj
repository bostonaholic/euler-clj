(ns eu.euler002
  (:use [eu.core]
        [math.fibonacci]))

(defn euler002 [x]
  (reduce + (filter even? (fib-less-than x))))

(defn solution []
  (euler002 4000000))
