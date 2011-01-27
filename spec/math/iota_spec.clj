(ns math.iota
  (:use [math.iota]
        [speclj.core]))

(describe "math.iota tests"

  (it "should create a sequence using upto"
    (should= '(1 2 3 4 5 6 7 8 9) (upto 1 10))
    (should= '(-5 -4 -3 -2 -1 0 1 2 3 4) (upto -5 5)))

  (it "should create a sequence using downto"
    (should= '(10 9 8 7 6 5 4 3 2) (downto 10 1))
    (should= '(5 4 3 2 1 0 -1 -2 -3 -4) (downto 5 -5)))

  (it "should create iota sequences"
    (should= '(1 2 3 4 5 6 7 8 9) (to 1 10))
    (should= '(1 2 3 4 5 6 7 8 9) (to 10))))

