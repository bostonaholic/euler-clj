(ns math.prime
  (:use [math.core]))

(defn prime? [x]
  (cond
    (or (= x 2)
        (= x 3))
      true
    (or (< x 2)
        (even? x))
      false
    :else (no-factors? x)))

(defn prime-factors [x]
  (filter prime? (factors x)))

(defn prime-sequence []
  (filter prime? (iterate inc 1)))

(defn nth-prime [n]
  (last (take n (prime-sequence))))

(defn primes-below-n [n]
  (take-while
    (fn [y]
      (< y n)) (prime-sequence)))
