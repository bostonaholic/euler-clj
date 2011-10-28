(ns eu.prime
  (:use eu.math))

(defn prime? [x]
  "returns wheth a number is or is not prime"
  (cond
    (or (= x 2) (= x 3))
      true
    (or (< x 2) (even? x))
      false
    :else (no-factors? x)))

(defn prime-factors [x]
  "returns all the prime factors of x"
  (filter prime? (factors x)))

(defn prime-seq []
  "returns a lazy-seq of primes"
  (filter prime? (iterate inc 1)))

(defn nth-prime [n]
  "returns the nth prime number"
  (last (take n (prime-seq))))

(defn primes-below [n]
  "returns all primes below n"
  (take-while #(< % n) (prime-seq)))