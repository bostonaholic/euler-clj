(ns eu.core
  (:use [eu.core] :reload
        [speclj.core]))

(describe "Project Euler eu.core tests"

  (it "should be divisible"
      (should (divisible? 4 2))))

;(run-specs)
