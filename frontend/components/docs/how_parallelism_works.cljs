(ns frontend.components.docs.how-parallelism-works)

(def article
  {:title "Does parallelism really work?"
   :last-updated "Feb 2, 2013"
   :url :how-parallelism-works
   :content [:div
             [:p
              "If you've ever tried a parallel testing solution, you've probably had a bad experience.Most attempt to run multiple tests within the same language runtime, or within multiple processes on the same system."]
             [:p
              "CircleCI doesn't do that.We split your tests up and run them on completely different machines, which share no memory, processes or databases.This fixes the vast majority of the problems that people experience with parallel testing."]
             [:p
              "Parallelism works if tests do not share any state.Occasionally tests share state by accident, for example through"
              [:a {:href "/docs/file-ordering"} "file-ordering bugs"]
              "or by using the same remote 3rd-party APIs.Fortunately, both problems are relatively easy to solve."]]})
