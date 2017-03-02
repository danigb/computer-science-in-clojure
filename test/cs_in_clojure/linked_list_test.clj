(ns cs-in-clojure.linked-list-test
  (:require [clojure.test :refer :all]
            [cs-in-clojure.linked-list :refer :all]))

(deftest linked-list
  (testing "Create a linked list"
    (is (= "value" (head (llist "value"))))))
