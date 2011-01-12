(ns eu.euler5
  (:use eu.core))

(defn euler5 [n]
  (reduce lcm (range 1 (+ 1 n))))
