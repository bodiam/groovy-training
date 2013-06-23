def numbers = [1, 2, 3, 4, 5]
def names = ['erik', 'henk', 'wim', 'klaas']
def fruits = [kiwi:4, grapefruit: 2, banana: 8]


numbers.each {
    println it
}


// print numbers in till 9 using a range
(1..<10).each { number ->
    println number
}

// print all names containing a 'k'
names.each {
    if(it.contains('k')) {
        println it
    }
}

// or....
println names.findAll { it.contains('k')}

def doubles = numbers.collect { number ->
    number * 2
}

assert [2,4, 6, 8, 10] == doubles


fruits.each { fruit, price ->
    println "a $fruit costs $price"
}
