object SpaceAge {
    def onEarth(sec: Double): Double = sec / 31557600
    
    def onMercury(sec: Double): Double = onEarth(sec) / 0.2408467 

    def onVenus(sec: Double): Double = onEarth(sec) / 0.61519726

    def onMars(sec: Double): Double = onEarth(sec) / 1.8808158

    def onJupiter(sec: Double): Double = onEarth(sec) / 11.862615

    def onSaturn(sec: Double): Double = onEarth(sec) / 29.447498

    def onUranus(sec: Double): Double = onEarth(sec) / 84.016846

    def onNeptune(sec: Double): Double = onEarth(sec) / 164.79132
}