(ns frontend.models.test
  (:require [clojure.string :as string]
            [frontend.state :as state]
            [frontend.utils :as utils :include-macros true]
            [goog.string :as gstring]
            goog.string.format))

(defmulti format-test-name :source)

(defmethod format-test-name :default [test]
  (:name test))

(defmethod format-test-name "lein-test" [test]
  (str (:classname test) "/" (:name test)))

(defmethod format-test-name "cucumber" [test]
  (if (string/blank? (:name test))
    (:classname test)
    (:name test)))

(defn pretty-source [source]
  (case source
    "cucumber" "Cucumber"
    "rspec" "RSpec"
    source))

(defn failed? [test]
  (not= "success" (:result test)))
