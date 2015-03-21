(ns cljs-unit-test.core)

(defn sum-two-numbers
  "Returns sum of two numbers"
  [x y]
  (+ x y))

(defn set-html! [el content]
    (set! (.-innerHTML el) content))

(defn ^:export init []
    (let [element (.getElementById js/document "main")
          content (str "2 + 2 = " (sum-two-numbers 2 2))]
        (set-html! element content)
        ))
