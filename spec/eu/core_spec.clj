(ns eu.core
  (:use [eu.core]
        [speclj.core]))

(describe "Project Euler eu.core tests"

  (it "should be divisible"
      (should (divisible? 4 2)))

  (it "should return first x items in fibonacci sequence"
      (should= '(0 1 1) (fib 3))
      (should= '(0 1 1 2 3 5 8 13) (fib 8)))

  (it "should return items in fib sequence less than x"
      (should= '(0 1 1 2 3 5) (fib-less-than 8))))

;(run-specs)
