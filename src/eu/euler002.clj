(ns eu.euler002
  (:use eu.core
        bostonaholic.utils.math.fibonacci))

(defn euler002 [x]
  (reduce + (filter even? (fib-less-than x))))

(defn solution []
  (euler002 4000000))
