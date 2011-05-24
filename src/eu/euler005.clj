(ns eu.euler005
  (:use eu.core
        bostonaholic.utils.math))

(defn euler005 [n]
  (reduce lcm (range 1 (+ 1 n))))

(defn solution []
  (euler005 20))
