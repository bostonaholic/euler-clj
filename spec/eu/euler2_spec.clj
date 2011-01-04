(ns eu.euler2
  (:use [eu.euler2]
        [speclj.core]))

(describe "Project Euler problem 2"

  (it "should solve mini euler2"
    (should= 10 (euler2 9)))
  
  (it "should solve euler2"
    (should= 4613732 (euler2 4000000))))
