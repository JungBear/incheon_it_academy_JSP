import Image from "next/image"

type Props = {}

export default function WeatherIcon(props : React.HTMLProps<HTMLDivElement> & {iconName:string}){
    return(
        <div {...props} className="weather-icon-container">
            <Image src={`https://openweathermap.org/img/wn/${props.iconName}@4x.png`} 
            alt='weather-icon' width={100} height={100} className="weather-icon"/>
        </div>
    )
}

// https://openweathermap.org/img/wn/01d@4x.png