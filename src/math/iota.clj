(ns math.iota)

(defn iota [t nxt stop y]
  (take-while stop (iterate #(t (nxt %)) y)))

(def upto
  (fn [start end]
    (iota identity inc #(< % end) start)))

(def downto
  (fn [start end]
    (iota identity dec #(> % end) start)))

(def to
  (fn this
    ([end]
     (this 1 end))
    ([start end]
     (if (<= start end)
       (upto start end)
       (downto start end)))))
