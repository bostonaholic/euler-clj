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

(defn factors-seq [x rang]
  (for [i rang
        :when (divisible? x i)]
    i))

(defn factors [x]
  (cond
    (and (not (= x 2)) (even? x))
      (cons 2 (factors-seq x (range 3 (+ 1 (/ x 2)))))
    (and (not (= x 3)) (divisible? x 3))
      (cons 3 (factors-seq x (range 4 (+ 2 (Math/sqrt x)))))
    :else
      (factors-seq x (range 3 (+ 1 (Math/sqrt x))))))

(defn no-factors? [x]
  (not-any? #(zero? (rem x %))
            (factors x)))

(defn product-of-collection [coll]
  (reduce * coll))

