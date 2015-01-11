/*
 * This source code is part of the research paper
 * "Applying Model-View-Presenter Architecture to the Android Framework with App Prototype"
 *
 * Software Architecture and Management,
 * Herman-Hollerith-Zentrum, Reutlingen University
 *
 * Authors:  Dennis G. Geisse,
 *           Iven John,
 *           Daniel Joos,
 *           Sebastian Kotstein,
 *           Michael Wurster
 *
 * Year:     2015
 */

package inf.msc.yawapp.owm;

import net.aksingh.java.api.owm.CurrentWeatherData;

public interface OpenWeatherMapAdapter {
    public CurrentWeatherData currentWeatherByCityName(final String cityName) throws OpenWeatherMapException;

    public CurrentWeatherData currentWeatherByCityCode(long cityCode) throws OpenWeatherMapException;

    public CurrentWeatherData currentWeatherByCoord(float latitude, float longitude) throws OpenWeatherMapException;
}
