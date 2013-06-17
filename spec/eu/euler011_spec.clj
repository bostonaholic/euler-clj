(ns eu.euler011-spec
  (:use speclj.core
        eu.euler011))

(describe "Project Euler problem 11"
          (it "returns the adjacent items in nested vectors"
              (should= '(1 2 3 4 6 7 8 9)
                       (neighbors [[1 2 3] [4 5 6] [7 8 9]] 2)))
          ;; (it "returns a list of all of the unique adjacent products"
          ;;     (should= '(16 392 98 2401)
          ;;              (adjacent-products 2 [[8 2]
          ;;                                    [49 49]])))
          )
