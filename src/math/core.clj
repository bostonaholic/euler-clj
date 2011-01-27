(ns math.core
  (:use [clojure.set]))

(defn divisible? [x, divisor]
  (zero? (rem x divisor)))

(defn square [x]
  (* x x))

(defn least [coll]
  (apply min coll))

(defn greatest [coll]
  (apply max coll))

(defn multiples [x]
  (filter #(divisible? % x) (iterate inc 1)))

(defn common [collA collB]
  (lazy-seq (intersection (set collA)
                          (set collB))))

(defn common-multiples [a b]
  (common (take-while #(<= % (* a b)) (multiples a))
          (take-while #(<= % (* a b)) (multiples b))))

(defn lcm [a b]
  (least (common-multiples a b)))

(defn loop-factors [x r]
  (for [i r
        :when (divisible? x i)]
    i))

(defn factors [x]
  (cond
    (and (not (= x 2)) (even? x))
      (cons 2 (loop-factors x (range 3 (+ 1 (/ x 2)))))
    (and (not (= x 3)) (divisible? x 3))
      (cons 3 (loop-factors x (range 4 (+ 2 (Math/sqrt x)))))
    :else
      (loop-factors x (range 3 (+ 1 (Math/sqrt x))))))

(defn no-factors? [x]
  (= '() (factors x)))

(defn product-of-collection [coll]
  (reduce * coll))

