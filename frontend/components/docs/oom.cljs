(ns frontend.components.docs.oom)

(def article
  {:title "OOM killer ran"
   :last-updated "Feb 2, 2013"
   :content [:div
             [:p
              "Your build contains a message that says the Linux Out-of-Memory (OOM)killer ran."]
             [:p
              "The reason for this is your builds run in a VM with 2GB ofavailable RAM. If you go over that limit, Linux kills a process,somewhat arbitrarily."]
             [:p
              "Unfortunately, there's no good way for us to know which processwas killed. While testing, it's commonly your application, orDB, or web browser."]
             [:p
              "Hitting the RAM limit is typically a bug. If your tests actuallyneed more than 2GB of RAM, please"]
             [:h2 "Debugging"]
             [:p
              "Use the"
              [:a {:href "/docs/ssh-build"} "SSH button"]
              "to ssh into a running build and run"
              [:code "top"]
              " + $e($c(.))"]
             [:p
              "Hit \\shift+m\\ to sort by memory usage and watch what process is using the most memory while your tests run."]
             [:p
              "The number to pay attention to is the RES (short for resident) column. This tracks the actual ram used by a process. Note that the 2GB limit applies to the sum of all processes running in your container, not just a single process."]
             [:p
              "One thing to keep in mind is that the %MEM you see in top is the percentage of the entire machine, not just the container that your builds are running in. The OOM killer typically runs when a process uses up 2-3% of total memory."]]})

