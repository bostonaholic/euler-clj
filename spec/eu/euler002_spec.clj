(ns eu.euler002-spec
  (:use [eu.euler002]
        [speclj.core]))

(describe "Project Euler problem 2"

  (it "should return first x items in fibonacci sequence"
    (should= '(0 1 1) (fib 3))
    (should= '(0 1 1 2 3 5 8 13) (fib 8)))

  (it "should return items in fib sequence less than x"
    (should= '(0) (fib-less-than 1))
    (should= '(0 1 1 2 3 5) (fib-less-than 8)))

  (it "should solve mini euler2"
    (should= 10 (euler002 9)))
  
  (it "should solve euler2"
    (should= 4613732 (euler002 4000000))))
