import { Button, Table } from 'react-bootstrap'
import './Cart.css'
import { useDispatch, useSelector } from 'react-redux'
import { changeData } from '../store';
import data from '../data';

// /cart로 이동하면 보여줄 컴포넌트
export default function Cart(){
    // 등록된 슬라이스 가져오기(리덕스)
    // useSelector로 슬라이스 가져올수 있다.
    let slice1 = useSelector((state)=>{return state});
    console.log("slice1 : " + slice1.slice1);

    let slice2 = useSelector((state)=>{return state});
    console.log(slice2);

    //리덕스 슬라이스 변경 기능 변수화
    let dispatch = useDispatch();
    console.log("dispatch slice1 : " + slice1.slice1);

    return(
        <div>
            {/* <Button onClick={()=>{dispatch(changeData(2))}}>슬라이스1 변경</Button> */}
            <Table striped bordered hover>
                <thead>
                    <tr>
                        <th>#</th>
                        <th>상품명</th>
                        <th>설명</th>
                        <th>갯수</th>
                        <th>추가</th>
                    </tr>
                </thead>
                <tbody>
                    {   
                        data.map((e, idx)=>
                            <tr key={idx}>
                                <td>{idx+1}</td>
                                <td>{e.title}</td>
                                <td>{e.content}</td>
                                <td>1</td>
                                <td><Button>+</Button></td>
                            </tr>
                        )
                    }
                    {/* <tr>
                        <td>idx</td>
                        <td>{data[0].title}</td>
                        <td>{data[0].content}</td>
                        <td>1</td>
                        <td><Button>+</Button></td>
                    </tr> */}

                </tbody>
            </Table>
        </div>
    )
}