// With grouping we get a multidimensional array.
def group = ('Henk and Henk, Robert and Wim' =~ /(\w+) and (\w+)/)
assert group.hasGroup()
assert 2 == group.getCount()
assert 'Henk and Henk'== group[0][0]
assert 'Henk' == group[0][1]
assert 'Henk' == group[0][2]
assert 'Robert' == group[1][1]
assert 'Wim' == group[1][2]
