(ns eu.euler016
  (:use eu.math
        [clojure.math.numeric-tower :only [expt]]))

(defn euler016 [n exp]
  (apply + (digits (expt n exp))))

(defn solution []
  (euler016 2 1000))