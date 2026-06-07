param([string]$mainClass = "aspectos.Main")
$aspectj = "$env:USERPROFILE\.m2\repository\org\aspectj\aspectjrt\1.9.22.1\aspectjrt-1.9.22.1.jar"
java -cp "target/classes;$aspectj" $mainClass
