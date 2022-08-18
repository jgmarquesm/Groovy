Tweet tweet1 = new Tweet("jgmarquesm", "testando1")
Tweet tweet2 = new Tweet("jgmmendes", "testando12")

tweet2.addToFav(10)
tweet2.addToRetweet(15)
println tweet2

tweet1.addToRetweet()
tweet1.addToFav()
println tweet1