(ns cs-in-clojure.linked-list)

(deftype Node [value prev next])


(defn llist [value]
  (Node. value nil nil))

(defn head [list]
  (.value list))
