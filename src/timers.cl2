(defmacro do-interval
  "Executes a block of code repeatedly, with a
  fixed time delay between each execution."
  [time & body]
  `(setInterval
    (fn []
      ~@body)
    ~time))

(defmacro add-interval
  "Assigns a do-interval to a symbol so that it can be removed
  in the future."
  [symbol time & body]
  `(def ~symbol (do-interval ~time ~@body)))

(defmacro remove-interval
  "Removes a named interval."
  [symbol]
  `(clearInterval ~symbol))
