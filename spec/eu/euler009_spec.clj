(ns eu.euler009
  (:use [eu.euler009]
        [speclj.core]))

(describe "Project Euler problem 9"

  (it "should find the Pythagorean triplet"
    (should (pyth-triplet? 3 4 5))
    (should-not (pyth-triplet? 4 3 5))))

