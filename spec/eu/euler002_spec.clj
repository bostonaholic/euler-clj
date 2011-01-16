(ns eu.euler002
  (:use [eu.euler002]
        [speclj.core]))

(describe "Project Euler problem 2"

  (it "should solve mini euler2"
    (should= 10 (euler002 9)))
  
  (it "should solve euler2"
    (should= 4613732 (euler002 4000000))))
