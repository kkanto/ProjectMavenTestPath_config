 
listView('ProjectMavenTestPath Jobs') {
    description('ProjectMavenTestPath Jobs')
    jobs {
        regex('ProjectMavenTestPath_.+')
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
