(ns eu.core)

(defn palindrome? [s]
  (cond
    (or (= 0 (.length (str s)))
        (= 1 (.length (str s))))
      true
    (= (first (str s))
       (last (str s)))
      (recur (subs (str s)
                   1
                   (- (.length (str s)) 1)))
    :else
      false))

