(ns eu.euler009-spec
  (:use speclj.core
        eu.euler009))

(describe "Project Euler problem 9"

  (it "should find the Pythagorean triplet"
    (should (pyth-triplet? 3 4 5))
    (should-not (pyth-triplet? 4 3 5))))

