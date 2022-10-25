 
listView('nowy_projekt1234567304540 Jobs') {
    description('nowy_projekt1234567304540 Jobs')
    jobs {
        regex('nowy_projekt1234567304540_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
