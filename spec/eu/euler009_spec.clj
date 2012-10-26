(ns eu.euler009-spec
  (:use speclj.core
        eu.euler009))

(describe "Project Euler problem 9"

  (it "determines if 3 numbers are a Pythagorean triplet"
      (should (pyth-triplet? [3 4 5]))
      (should (pyth-triplet? [5 12 13]))
      (should-not (pyth-triplet? [4 3 5])))

  (it "generates a list of Pythagorean triplets up to a max"
      (should= [3 4 5] (first (pyth-triplets 12)))
      (should= [5 12 13] (second (pyth-triplets 100))))

  (it "finds the Pythagorean triplet for which the sum equals the number"
      (should= [3 4 5] (first (pyth-triplets-for-max 12)))))