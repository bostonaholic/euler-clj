(ns eu.euler007-spec
  (:use speclj.core
        eu.euler007))

(describe "Project Euler problem 7"

  (it "should find the 10001st prime number"
    (should= 104743 (euler007 10001))))
