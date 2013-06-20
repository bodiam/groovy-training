def working = { arg1, arg2, arg3 = 'atos' ->
    "$arg1 $arg2 $arg3"
}
println working("I","work at")

def closure = working.ncurry(1,'love')

def m(arg, closure) {
    println closure.call(arg)
}

m('I',closure)
